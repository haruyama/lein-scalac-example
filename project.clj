(defproject lein-scalac-example "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]]
  :plugins  [[haruyama/lein-scalac "0.1.1"]
             [haruyama/lein-scalatest "0.0.4"]]
  :scala-source-paths ["src/scala"]
  :scala-test-paths   ["test/scala"]
  :scala-version "2.10.2"
  :prep-tasks  ["scalac"])

