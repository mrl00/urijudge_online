module Main where

import Control.Monad (replicateM)
import Text.Printf (printf)

input :: IO [[Double]]
input = do
  x <- replicateM 2 getLine
  return $ map ((\y -> map read y :: [Double]) . words) x

calcPrice :: [Double] -> Double
calcPrice [_, q, v] = q * v

main :: IO ()
main = do
  x <- input
  printf "VALOR A PAGAR: R$ %.2f\n" $ sum $ map calcPrice x
