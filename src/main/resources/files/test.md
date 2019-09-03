#### 中文数据乱码

&ensp;&ensp;&ensp;&ensp;在jdbc设置如下：
```
?useUnicode=true&characterEncoding=utf8
```

&ensp;&ensp;&ensp;&ensp;同时，数据库对应表的对应行设置如下：

```
ENGINE=InnoDB DEFAULT CHARSET=utf8;
```