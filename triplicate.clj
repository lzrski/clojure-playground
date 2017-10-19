(defn triplicate
  [callee]  ; arguments
  (callee)  ; body
  (callee)  ; body
  (callee)) ; body

(triplicate #(println "Hello"))
