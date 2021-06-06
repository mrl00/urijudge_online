module Main where

import Data.List ()
import FB.Collatz (collatzConj)
import Text.Printf ()

main :: IO ()
main = do
  print . collatzConj 7
