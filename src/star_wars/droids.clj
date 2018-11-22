(ns star-wars.droids
  (:require
     [star-wars.db :as db]
     [taoensso.faraday :as ddb]))

(defn get-droid [context arguments value]
  (let [{:keys [id]} arguments]
    (ddb/get-item db/config :droids {:id id})))

(defn create-droid [context arguments value]
  (let [{:keys [name]} arguments
        id (str (java.util.UUID/randomUUID))]
    (do (ddb/put-item db/config :droids {:id id :name name})
        id)))
