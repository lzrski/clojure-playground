(defn opposite
  [predicate]
  (fn [& args]
    (not (apply predicate args))))

(println ((opposite =) 2 3)) ; true
(println ((opposite =) 2 2)) ; false
(println ((opposite (constantly true)))) ; false
