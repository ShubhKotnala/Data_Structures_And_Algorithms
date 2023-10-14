/*

Given two json objects, merge them such that, if there are two identical keys with same value, don't do anything, 
but if the values are different, make array out of it so that no data is lost.

Example:
    json1 = {
        a: "b",
        c: [
            "d",
            "e"
        ],
        x:"y",
        p:"q"
    }

    json2 = {
        a: "b",
        c: [
            "f",
            "g"
        ],
        i: "h",
        x: "z",
        p: ["r", "s"]
    }

    Here we have 
        - 'a' with the same value, so we will skip it, --> a: "b"
        - 'c' as array, merge two arrays into a single --> c: ["d","e","f","g"]
        - 'x' has different values, create array out of it --> x: ["y","z"]
        - 'p' has string and array as values, merge them --> p: ["q","r","s"]
        - 'i' is only present in json2, add it to result as is --> i: "h"

Note: This merging is a mixture of other types of merging for json objects.

*/

function mergeJSON(json1, json2) {
    let result = {};
    for (let key in json1) {
        if (json2.hasOwnProperty(key)) {
            if (json1[key] !== json2[key]) {
                result[key] = [...json1[key], ...json2[key]];
            } else {
                result[key] = json1[key];
            }
        } else {
            result[key] = json1[key];
        }
    }

    for (let key in json2) {
        if (!json1.hasOwnProperty(key)) {
            result[key] = json2[key];
        }
    }

    return result;
}
const json1 = {
    a: "b",
    c: [
        "d",
        "e"
    ],
    x: "y",
    p: "q"
}

const json2 = {
    a: "b",
    c: [
        "f",
        "g"
    ],
    i: "h",
    x: "z",
    p: ["r", "s"]
}


console.log(mergeJSON(json1, json2))