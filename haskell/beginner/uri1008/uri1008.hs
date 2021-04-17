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
    a <- readLn :: IO Int
    b <- readLn :: IO Double 
    c <- readLn :: IO Double
    printf "NUMBER = %d\nSALARY = U$ %.2f\n" a (b * c)

