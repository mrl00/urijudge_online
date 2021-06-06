module Main where

import Control.Monad ( replicateM )
import Text.Printf ( printf, PrintfArg, PrintfType )

input :: IO [[Int]]
input = do
   n <- readLn :: IO Int
   i <- replicateM n getLine
   return $ map ((\x -> map read x :: [Int]) . words) i

oddSum :: [Int] -> Int
oddSum [x,y] = sum [k| k <- [x..(x + 2*y - 1)], odd k]

showResult :: (PrintfArg t1, PrintfType t2) => [t1] -> t2
showResult (x:xs) = printf "%d\n" x

main :: IO ()
main = do
   x <- input
   mapM_ (print . oddSum) x
