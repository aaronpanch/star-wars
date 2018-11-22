(defproject star-wars "0.1.0-SNAPSHOT"
  :description "Playing the GraphQL and Clojure"
  :url "https://github.com/aaronpanch/star-wars"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [com.walmartlabs/lacinia "0.31.0-SNAPSHOT-1"]
                 [com.taoensso/faraday "1.9.0"]]
  :main ^:skip-aot star-wars.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
