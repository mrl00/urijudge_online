module Main where

import Text.Printf
import Data.List

pointQuadrant :: [Double] -> String
pointQuadrant [x,y] | x > 0 && y > 0 = "Q1" 
                    | x > 0 && y < 0 = "Q4"
                    | x < 0 && y > 0 = "Q2"
                    | x < 0 && y < 0 = "Q3"
                    | x == 0 && y /= 0 = "Eixo Y"
                    | x /= 0 && y == 0 = "Eixo X"
                    | otherwise = "Origem"




main :: IO ()
main = do
   input <- getLine
   let x = map read (words input) :: [Double]
   putStrLn $ pointQuadrant x
