(defn calculate [x y]
  (let [sum (+ x y)
        product (* x y]
        (if (> sum 10)
          {:sum sum
           :product product
           :status "high"}
          {:sum sum
           :product product))

        (defn process-data [items]
          (map (fn [item]
                 (assoc item :processed true
                        :timestamp (System/currentTimeMillis)))
               items)

          (defn validate [config
                          (and (contains? config :name)
                               (contains? config :value)
                               (string? (:name config)))

                          (let [data [{:id 1 :name "foo"}
                                      {:id 2 :name "bar"]
                                      (filter (fn [x] (> (:id x) 0)) data)
