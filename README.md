# Custom Anvil Recipe Refactor (CARR)

自定义铁砧配方插件重构

## 前言

这是一个重构项目

重构的是之前写的[自定义铁砧配方插件](https://github.com/Tomotopieces/CustomAnvilRecipe), 之前写的是什么垃圾代码...

虽然说是重构但也不知道什么时候会写完

如果你现在所在的是`master`分支, 详细内容请看`development`分支

## 项目介绍

一个允许用户创建自定义的铁砧插件的配方

## 项目结构

```
|- CARR
    |- command
        |- completer
        |- executor
        |- registrar
    |- event
        |- listener
        |- registrar
    |- gui
    |- entity
    |- util
```
