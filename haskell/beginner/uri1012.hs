module Main where

import Control.Monad
import Text.Printf

myPi :: Double
myPi = 3.14159


input :: IO [Double]
input = do
   x <- getLine
   return $ map (\x -> read x :: Double) (words x)

triangle [a,_,c] = (a * c) / 2.0

circle [_,_,c] = myPi * c ^ 2

trapezium [a,b,c] = c*(abs $ a + b)/2.0

square [_,b,_] = b^2

rectangle [a,b,_] = a * b  

main :: IO ()
main = do
   x <- input
   printf "TRIANGULO: %.3f\n" $ triangle x
   printf "CIRCULO: %.3f\n" $ circle x
   printf "TRAPEZIO: %.3f\n" $ trapezium x
   printf "QUADRADO: %.3f\n" $ square x
   printf "RETANGULO: %.3f\n" $ rectangle x
