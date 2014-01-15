(ns slack-hooks.slack-test
  (:require [clojure.test :refer :all]
            [slack-hooks.slack :as slack]))

(deftest escape-test
  (testing "Escapes HTML characters"
    (is (= "This is &lt;a&gt; test."
           (slack/escape "This is <a> test.")))))