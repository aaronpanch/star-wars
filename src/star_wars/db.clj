(ns star-wars.db
  (:require
    [environ.core :refer [env]]))

(def config
  (if (env :development)
    {:access-key "access"
     :secret-key "secret"

     :endpoint "http://localhost:8000"}
    {:endpoint "http://dynamodb.us-east-1.amazonaws.com"}))
