module Main where

import Text.Printf
import Data.List
import Data.Maybe

data Stack a = Stack [a] deriving Show

newStack :: Stack a
newStack = Stack []

push :: a -> Stack a -> Stack a
push a Stack (Stack xs) = Stack (x:xs)

pop :: Stack a -> Stack a
pop (Stack []) = Stack []
pop (Stack (x:xs)) = Stack xs

f :: Eq a => [a] -> [a] -> [a]
f [] _ = []
f _ [] = []
f (a:as) (b:bs) | a /= b    = a : f as (b:bs)
                | otherwise = f as bs ++ [b]

main :: IO ()
main = do
   input1 <- getLine
   input2 <- getLine
   let x1 = trim input1 
   let x2 = trim input2
   putStrLn $"ans = " ++ (f x1 x2)
   putStrLn $ "x1 = " ++ x1
   putStrLn $ "x2 = " ++ x2
   where trim s = [c | c <- s, c /= ' ']
