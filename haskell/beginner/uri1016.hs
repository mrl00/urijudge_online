module Main where

import Control.Monad
import Text.Printf

main :: IO ()
main = do
   x <- readLn :: IO Int
   printf "%d minutos\n" (x*2)
