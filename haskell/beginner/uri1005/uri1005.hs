module Main where

import Text.Printf (printf)

mean :: (RealFloat a) => a -> a -> a
mean a b = (a * 3.5 + b * 7.5) / 11

main :: IO ()
main = do
  a <- readLn :: IO Double
  b <- readLn :: IO Double
  printf "MEDIA = %.5f\n" $ mean a b
