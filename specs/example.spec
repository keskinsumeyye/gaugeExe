Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs
Login
------
* 1 saniye  bekle
* Arama alanına "telefon" bilgisini yaz
* Css "input[id='query']" li elementi bul ve enter butonuna bas
* 1 saniye  bekle
*"div[class='inner']>ul>li:nth-of-type(1)>ul:nth-of-type(1)>li>a" css li elemente tıkla
* 1 saniye  bekle

arama
------------
* Ürün arama alanına "Telefon" bilgisini gir ve ara
* Cep telefonları sekmesine tıkla
* Açılan sayfadan ilk ürünü seç

bilgisayari sepete ekle
-----------------------
* Açılan sayfadan Armağan'ın seçtiği ürün sepete eklenir







