module Main where

import Text.Printf (printf)

area :: (RealFloat a) => a -> a
area r = 3.14159 * (r ^ 2)

main :: IO ()
main = do
  r <- readLn :: IO Double
  printf "A=%.4f\n" $ area r
