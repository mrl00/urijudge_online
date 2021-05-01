module Main where

import Text.Printf

iochar 3 _ = putStr ""
iochar n x = do
	printf "A = %s, B = %s, C = %s\n" ((x!!) $ mod n 3) ((x!!) $ mod (n + 1) 3) ((x!!) $ mod (n + 2) 3)
	iochar (n+1) x

main :: IO ()
main = do
	contents <- getContents
	let x = lines contents
	iochar 0 x
