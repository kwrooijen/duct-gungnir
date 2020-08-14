(ns duct.sql.gungnir
  (:require
   [duct.database.sql :as sql]
   [gungnir.database]
   [integrant.core :as ig]))

(defmethod ig/init-key ::make-datasource! [_ opts]
  (gungnir.database/make-datasource! opts))

(defmethod ig/resolve-key ::make-datasource! [_ _opts]
  (sql/->Boundary {:datasource gungnir.database/*database*}))

(defmethod ig/init-key ::set-datasource! [_ opts]
  (gungnir.database/set-datasource! opts))
