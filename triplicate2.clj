(defn triplicate
  [callee & args]  ; arguments
  (apply callee args)  ; body
  (apply callee args)  ; body
  (apply callee args)) ; body

(triplicate #(println "Hello" (count %&)) 30 20 10 0)
