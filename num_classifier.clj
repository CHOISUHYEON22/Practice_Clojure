(defn num-classify [number] 
      (let  [ sum (apply  + 
                          (filter #(zero? (rem number %)) 
                                  (range 1 (inc (/ number 2)))))] 
            (cond
                  (> sum number) "abundant number"
                  (< sum number) "deficient number"
                  (= sum number) "perfect number")))

(print "input number : ")
(println (str "This number is " (num-classify (Integer/parseInt (read-line)))))