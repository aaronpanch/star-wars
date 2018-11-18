(ns star-wars.schema
  (:require
    [clojure.java.io :as io]
    [com.walmartlabs.lacinia.util :as util]
    [com.walmartlabs.lacinia.schema :as schema]
    [clojure.edn :as edn]))

(defn get-hero [context arguments value]
  (let [{:keys [episode]} arguments]
    (if (= episode :NEWHOPE)
      {:id 1000
       :name "Luke"
       :home_planet "Tatooine"
       :appears_in ["NEWHOPE" "EMPIRE" "JEDI"]}
      {:id 2000
       :name "Lando Calrissian"
       :home_planet "Socorro"
       :appears_in ["EMPIRE" "JEDI"]})))

(defn load-schema
  []
  (-> (io/resource "star-wars-schema.edn")
      slurp
      edn/read-string
      (util/attach-resolvers {:get-hero get-hero
                              :get-droid (constantly '(1 2 3))})
      schema/compile))
