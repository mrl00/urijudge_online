module Main where

newtype Pair a b = Pair (a, b) deriving (Eq, Show)

instance (Num a, Num b) => Num (Pair a b) where
  Pair (a, b) + Pair (c, d) = Pair (a + c, b + d)
  Pair (a, b) * Pair (c, d) = Pair (a * c, b * d)
  Pair (a, b) - Pair (c, d) = Pair (a - c, b - d)
  abs (Pair (a, b)) = Pair (abs a, abs b)
  signum (Pair (a, b)) = Pair (signum a, signum b)
  fromInteger i = Pair (fromInteger i, fromInteger i)

fixInput :: Num a => String -> Pair a Int
fixInput s
  | (<= 1) $ length $ words s = Pair (0, 0)
  | otherwise = test
  where
    [a, b] = words s
    test
      | a == "SALIDA" = Pair (1, read b :: Int)
      | a == "VUELTA" = Pair (-1, negate $ read b :: Int)
      | otherwise = Pair (0, 0)

fixOutput :: (Show a1, Show a2) => Pair a2 a1 -> [Char]
fixOutput (Pair (a, b)) = show b ++ "\n" ++ show a

main :: IO ()
main = do
  contents <- getContents
  putStrLn $ fixOutput $ sum $ map fixInput (lines contents)
