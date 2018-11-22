(ns star-wars.db
  (:require
    [taoensso.faraday :as ddb]))

(def config
  { :access-key "bogus"
    :secret-key "secret"
    :endpoint "http://localhost:8000" })

(ddb/ensure-table config :droids [:id :s] {:throughput {:read 1 :write 1} :block? true })
