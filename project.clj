(defproject star-wars "0.1.0-SNAPSHOT"
  :description "Playing the GraphQL and Clojure"
  :url "https://github.com/aaronpanch/star-wars"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.9.0"]
                 [environ "1.1.0"]
                 [com.amazonaws/aws-lambda-java-core "1.2.0"]
                 [cheshire "5.8.1"]
                 [org.antlr/antlr4 "4.7.2-SNAPSHOT"] ; Built locally
                 [org.antlr/antlr4-runtime "4.7.2-SNAPSHOT"]
                 [com.walmartlabs/lacinia "0.31.0-SNAPSHOT-1" :exclusions [org.antlr/antlr4 org.antlr/antlr4-runtime]]
                 [com.taoensso/faraday "1.9.0"]]
  :main ^:skip-aot star-wars.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
