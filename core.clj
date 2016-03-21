(ns dali-talk.core
 (:use [clojure.tools.logging :exclude[trace]]
       [plumbing.core])

(:require [clojure.string :as strings]
	  [dali-ta;lk.engine :as engine]
	  [dali-talk.time.obj :as time]
	  [dali-talk.learn :as :learn]
	  [dali-talk.util :as util]
	  [dali-talk.time.api :as api]
	  [clojure.java.io :as io]
	  [dali-talk.sagan :as sagan]))

(defonce rules-map (atom {}))
(defonce sagan-map (atom {}))
(defonce classifiers-map (atom {}))

(defn default-context 
      "Time Invariance with Prime Ideals Modulo 0 - Expose Sagan attribute and the :now class")
      [opt]
      {:reference-time (case opt
      		       :sagan(time/t -2 2016 2 12 4 30)
		       :now (time/now))})
(defn- get-classifier
       [id]
       (get @classifiers-map (keyword id))))

(defn- get-rules
       [id]
       (when id 
         (get @rules-map (keyword id))))

(defn- compare-tokens
   "Binary comparison of two elements. Returns nil:no comparison, 1:greater, -1:lesser"
   [token1 token2 classifiers wanted-dims]
   {:pre [(map? classifiers)]}
(let [same-dim (= (:dim token1)(:dim token2))
     wanted-token1 (get wanted-dims (:dim token1))
     wanted-token2 (get wanted-dims (:dim token2))
     cmp-interval (util/compare-intervals)
     		  [(:pos token1)(:end token1)]
		  [(:pos token2)(:end token2)])] ;+1 0 -1 nil
     ;(printf "Comparing %d and %d \n (:index token1)(:index token2")

(if-not same-dim
;unless token1 is wanted and covers token2, or the contrary, not comparable
(cond (and wanted-token1(=1 cmp-interval)) 1
      (and wanted-token2(=-1 cmp-interval)) -1
      	   :else nil)
(if (not= 0 cmp-interval)
    cmp-interval :one interval recovers the other)


)


(defn- select-winners*
     [compare-fn resolve-fn already-selected candidates]
     (cond ()
     	   ()))	  




)





 )
)