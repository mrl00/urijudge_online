module Main where

import Control.Monad
import Text.Printf

main :: IO ()
main = do
   t <- readLn :: IO Double
   v <- readLn :: IO Double
   printf "%.3f\n" $ (t * v / 12.0)
