module Main where

import Control.Monad
import Data.Array
import Data.Bits
import Data.List
import Data.Set
import Debug.Trace
import System.Environment
import System.IO
import System.IO.Unsafe
import Text.Printf

main :: IO()
main = do
    a <- getLine
    b <- readLn :: IO Double 
    c <- readLn :: IO Double
    printf "TOTAL = R$ %.2f\n" (b + 0.15*c)

