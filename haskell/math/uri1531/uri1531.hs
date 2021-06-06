module Main where

--fib1 n = snd . foldl fib_ (1, 0) . map (toEnum . fromIntegral) $ unfoldl divs n
--    where
--        unfoldl f x = case f x of
--                Nothing     -> []
--                Just (u, v) -> unfoldl f v ++ [u]
--
--        divs 0 = Nothing
--        divs k = Just (uncurry (flip (,)) (k `divMod` 2))
--
--        fib_ (f, g) p
--           | p         = (f*(f+2*g), f^2 + g^2)
--           | otherwise = (f^2+g^2,   g*(2*f-g))

--fib n = let fibs = 0:1:zipWith (+) fibs (tail fibs)
--        in fibs !! n

fib :: (Integral int, Num num) => int -> num
fib n
  | n >= 0 = upperRight $ matrixPower (Matrix 1 1 0) n
  | even n = negate . fib $ negate n
  | otherwise = fib $ negate n
{-# SPECIALIZE fib :: Int -> Int #-}
{-# SPECIALIZE fib :: Int -> Integer #-}

data Matrix a = Matrix a a a

upperRight :: Matrix a -> a
upperRight (Matrix _ a _) = a

matrixPower :: (Integral int, Num num) => Matrix num -> int -> Matrix num
matrixPower _ 0 = Matrix 1 0 1
matrixPower m 1 = m
matrixPower m n
  | r == 0 = square $ matrixPower m q
  | otherwise = times m . square $ matrixPower m q
  where
    (q, r) = quotRem n 2
{-# SPECIALIZE matrixPower :: Matrix Int -> Int -> Matrix Int #-}
{-# SPECIALIZE matrixPower :: Matrix Integer -> Int -> Matrix Integer #-}

square :: Num num => Matrix num -> Matrix num
square m = times m m
{-# SPECIALIZE square :: Matrix Int -> Matrix Int #-}
{-# SPECIALIZE square :: Matrix Integer -> Matrix Integer #-}

times :: Num num => Matrix num -> Matrix num -> Matrix num
times (Matrix a b c) (Matrix x y z) = Matrix (a * x + by) (a * y + b * z) (by + c * z)
  where
    by = b * y
{-# SPECIALIZE times :: Matrix Int -> Matrix Int -> Matrix Int #-}
{-# SPECIALIZE times :: Matrix Integer -> Matrix Integer -> Matrix Integer #-}

fibs = 0 : 1 : zipWith (+) fibs (tail fibs)

pisano m = 0 : 1 : helper (drop 2 fibs)
  where
    helper (x : y : xs)
      | a == 0 && b == 1 = []
      | otherwise = a : helper (y : xs)
      where
        a = x `mod` m
        b = y `mod` m

pisanoPeriod :: Integer -> Int
pisanoPeriod m = length $ pisano m

main :: IO [()]
main = do
  content <- getContents
  let xs = map (\x -> map read (words x) :: [Int]) (lines content)
  let ys = fans xs
  mapM print ys
  where
    fib2 = fib . fib
    fans [] = []
    fans ds = [fib2 a `mod` b | [a, b] <- ds]
