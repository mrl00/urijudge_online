module Main where

import Control.Monad ()
import Data.Array ()
import Data.Bits ()
import Data.List ()
import Data.Set ()
import Debug.Trace ()
import System.Environment ()
import System.IO ()
import System.IO.Unsafe ()
import Text.Printf (printf)

mean :: (Num a) => a -> a -> a -> a -> a
mean a b c d = a * b - c * d

main :: IO ()
main = do
  a <- readLn :: IO Int
  b <- readLn :: IO Int
  c <- readLn :: IO Int
  d <- readLn :: IO Int
  printf "DIFERENCA = %d\n" $ mean a b c d
