(def
  expr '(Math/cos Math/PI))
(println expr " -> " (eval expr))

(def expr
  '(let [x (Math/random)]
    (+ (Math/pow (Math/sin x) 2) (Math/pow (Math/cos x) 2))
  )
)

(println expr " -> " (eval expr))
