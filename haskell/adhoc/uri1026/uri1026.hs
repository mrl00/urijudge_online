module Main where

import Data.Bits (Bits (xor))

rInt :: String -> Integer
rInt = read

main :: IO ()
main = getContents >>= mapM_ ((print . (\[a, b] -> xor a b) . map rInt) . words) . lines