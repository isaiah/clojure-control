(defproject org.flowerborn/control "0.2.3-SNAPSHOT"
  :description "A clojure DSL for system admin and deployment with many remote machines"
  :url "https://github.com/isaiah/clojure-control"
  :author "dennis zhuang(killme2008@gmail.com) isaiah peng(issaria@gmail.com)"
  :dependencies [[org.clojure/clojure "1.2.1"]
				 [org.clojure/clojure-contrib "1.2.0"]]
  :dev-dependencies [[lein-exec "0.1"]]
  :shell-wrapper {:bin "bin/clojure-control"
                  :main control.main})
