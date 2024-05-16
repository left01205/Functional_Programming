(defn hello_word_n_times [n]
  (dotimes [_ n]
    (println "Hello World")))

(def n (Integer/parseInt (read-line)))
(hello_word_n_times n)
