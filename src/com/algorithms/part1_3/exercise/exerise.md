# 课后练习

## 1.3.1

## 1.3.2
> it  
问的是输出是什么，不是栈中剩下什么  
>考察Stack后进先出的性质

## 1.3.3
> 不可能的出栈顺序问题  
>思维模式：  
>归纳法：先从少量数字开始找规律  
>规律：元素x，比x在原队列中靠前的，位于出来的序列中的x之后时，必须为逆序。  
>因为，压进去时就是顺着压入的，在x之后出来时必是逆序的啊！而在x后面的（比x大的）想进就进想出就出，没什么影响。  
>故：  
>a：能  
>b：不能，9之后0、1不对  
>c：能，从9开始挨个判断，所有的数字后面比自己小的数都是逆序  
>d：能  
>e：能  
>f：不能，8后面1、2不对  
>g：不能，9后面0、2不对  
>h：能
>  
>考察Stack后进先出的性质 


## 1.3.4
> 见Patentheses1_3_4  
>考察Stack后进先出的性质

## 1.3.5
> 略
>任何一个整数的二进制表示，都可以用这个函数来计算
>考察Stack后进先出的性质

## 1.3.6
> 逆序  
>考察Stack后进先出的性质

## 1.3.7
> 见Stack1_3_7  
>考察

## 1.3.8
> DoublingStackOfStrings这个类没有找到

## 1.3.9

---

## 1.3.18
> 略

## 1.3.19
```
public void deleteLast{
    if(first==null){
        throw new RuntimeException();
    }
    if(first.next==null){
        first=null;
        return;
    }
    for(Node i=first;i!=null;i=i.next){
       if(i.next.next==null){
           i.next=null;
           return;
       }
    }
}
``` 
## 1.3.20
```
//假设该链表是first
public void delete(int k){
    if (k>N||k<1||N<1){
        System.out.println("链表长度为"+N+"，要删除的第"+k+"个元素不存在");
    }
    int temp =0;
    for (Node i=first;i!=null;i=i.next){
        temp++;
        if (temp==k-1){//要从第k-1个元素开刀
            i=i.next.next;
            return;
        }
    }
}
//我没有考虑k为1的情况！！
if(k==1){
    first = first.next;
    return;
}
```

## 1.3.21







