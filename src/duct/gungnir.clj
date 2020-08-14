(ns duct.gungnir
  (:require
   [gungnir.model]
   [integrant.core :as ig]))

(defmethod ig/init-key ::model [k opts]
  (gungnir.model/register!
   {(->> k (remove #{::model}) last name keyword)
    opts}))
