(defproject kwrooijen/duct-gungnir "0.0.1-SNAPSHOT"
  :description "Duct library for Gungnir"
  :url "https://github.com/kwrooijen/duct-gungnir"
  :license {:name "MIT"}
  :dependencies [[duct/database.sql "0.1.0"]
                 [integrant "0.8.0"]
                 [kwrooijen/gungnir "0.0.1-SNAPSHOT"]]
  :deploy-repositories [["clojars" {:url "https://clojars.org/repo"
                                    :sign-releases false}]])
