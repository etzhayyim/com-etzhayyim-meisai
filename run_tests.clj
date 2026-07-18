(require '[clojure.test :as t]
         'meisai.methods.test-autorun 'meisai.methods.test-fx
         'meisai.methods.test-ingest 'meisai.methods.test-kotoba
         'meisai.methods.test-price-increases 'meisai.methods.test-recurring
         'meisai.methods.test-sources 'meisai.murakumo-test
         'meisai.repository-contract-test)
(let [s '[meisai.methods.test-autorun meisai.methods.test-fx
          meisai.methods.test-ingest meisai.methods.test-kotoba
          meisai.methods.test-price-increases meisai.methods.test-recurring
          meisai.methods.test-sources meisai.murakumo-test
          meisai.repository-contract-test]
      r (apply t/run-tests s)]
  (System/exit (if (zero? (+ (:fail r) (:error r))) 0 1)))
