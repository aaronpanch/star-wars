(ns star-wars.core
  (:require
    [clojure.java.io :as io]
    [cheshire.core :as json]
    [star-wars.query :as query :refer [q]])
  (:import [com.amazonaws.services.lambda.runtime RequestStreamHandler])
  (:gen-class
   :implements [com.amazonaws.services.lambda.runtime.RequestStreamHandler]))

(defn -handleRequest [this in out context]
  (let [event (-> in io/reader (json/parse-stream keyword))
        result (query/q (-> event :body))]
    (with-open [writer (io/writer out)]
      (json/generate-stream result writer))))
