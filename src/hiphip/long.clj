(ns hiphip.long
  "Utilities for long arrays"
  (:refer-clojure :exclude [amap areduce alength aget aset aclone])
  (:import hiphip.long_.Helpers))

(def +type+ 'long)

(load "type_impl")
