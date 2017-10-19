(def
  expressions
  [
    '(Math/cos Math/PI)
    '(let
      [x (Math/random)]
      (+
        (Math/pow (Math/sin x) 2)
        (Math/pow (Math/cos x) 2)))
  ])

(def
  iterator
  #(str % " -> " (eval %)))

(prn
  (map iterator expressions))
