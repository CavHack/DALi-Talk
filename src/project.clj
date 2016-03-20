(defproject DALi-Talk "0.1.0"
	    :description "Probabilistic Parser"
	    :license {:name "Eclipse Public License"
	    :url "http://www.eclipse.org/legal/epl-v10.html"}
	    :url "https://github.com/CavHack/DALi-Talk"
	    :plugins [[s3-wagon-private "1.1.2"]
	    	     [lein-midje "3.1.3"]]
            :repl-options {:init-ns dali-talk.core}
	    :dependencies [[org.clojure/clojure "1.6.0"]
	    		   [org.clojure/tools.nrepl "0.2.3"]
			   [org.clojure/tools.logging "0.2.6"]
			   [clj-time "0.8.0"]
			   [prismatic/plumbing "0.3.3"]]
	     :deploy-repositories [["clojars" {:creds :gpg}]]
	     :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.6"]
	     	       	     		    [midje "1.6.3"]
					    [chesire "5.3.1]]}
             :uberjar {:aot [dali-talk.core]}}
             :test-selectors{:default (complement :benchmark)
	     		     :benchmark :benchmark}
             :scm {:name "git"
	           :url "https://github.com/CavHack/DALi-Talk"}
             :pom-addition [:developers [:developer
	     		   		[:name "https://dali.ninja"]
					[:email "curiemajorama@milkyexpress.space"]
					[:timezone "-7"]])