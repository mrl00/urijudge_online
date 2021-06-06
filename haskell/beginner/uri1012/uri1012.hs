module Main where

import Text.Printf (printf)

myPi :: Double
myPi = 3.14159

input :: IO [Double]
input = do
  map (\x -> read x :: Double) . words <$> getLine

triangle :: Fractional a => [a] -> a
triangle [a, _, c] = (a * c) / 2.0

circle :: [Double] -> Double
circle [_, _, c] = myPi * c ^ 2

trapezium :: Fractional a => [a] -> a
trapezium [a, b, c] = c * abs (a + b) / 2.0

square :: Num a => [a] -> a
square [_, b, _] = b ^ 2

rectangle :: Num a => [a] -> a
rectangle [a, b, _] = a * b

main :: IO ()
main = do
  x <- input
  printf "TRIANGULO: %.3f\n" $ triangle x
  printf "CIRCULO: %.3f\n" $ circle x
  printf "TRAPEZIO: %.3f\n" $ trapezium x
  printf "QUADRADO: %.3f\n" $ square x
  printf "RETANGULO: %.3f\n" $ rectangle x
