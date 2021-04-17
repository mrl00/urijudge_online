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

mean :: (RealFloat a) => a -> a -> a
mean a b = (a*3.5 + b*7.5)/11

main :: IO()
main = do
    a <- readLn :: IO Double
    b <- readLn :: IO Double
    printf "MEDIA = %.5f\n" $ mean a b

