
   function findSingle(ar, size)
    {

        let res = ar[0];
    for (let i = 1; i < size; i++)
    res = res ^ ar[i];

    return res;
	}

    let ar = [4, 4, 5, 5, 7, 3, 3];
    let n = ar.length;
    document.write("Element occurring once is "
    + findSingle(ar, n));
