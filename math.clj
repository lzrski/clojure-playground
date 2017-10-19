(prn (map
  #(str % " -> " (eval %))
  [ '(Math/cos Math/PI)
    '(let [x (Math/random) ]
      (+ (Math/pow (Math/sin x) 2) (Math/pow (Math/cos x) 2 ))
    )]))
