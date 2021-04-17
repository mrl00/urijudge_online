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

area :: (RealFloat a) => a -> a
area r = 3.14159 * (r ^ 2)

main :: IO()
main = do
    r <- readLn :: IO Double
    printf "A=%.4f\n" $ area r
