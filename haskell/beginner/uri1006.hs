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

mean :: (RealFloat a) => a -> a -> a -> a
mean a b c = (a*2 + b*3 + c*5)/10

main :: IO()
main = do
    a <- readLn :: IO Double
    b <- readLn :: IO Double
    c <- readLn :: IO Double
    printf "MEDIA = %.1f\n" $ mean a b c

