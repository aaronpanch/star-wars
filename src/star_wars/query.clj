(ns star-wars.query
  (:require
     [star-wars.schema :as s]
     [com.walmartlabs.lacinia :as lacinia]))

(def schema (s/load-schema))

(defn q
  [query-string]
  (lacinia/execute schema query-string nil nil))
