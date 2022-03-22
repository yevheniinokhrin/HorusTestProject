package com.nokhrin;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private List<Block> blocks;
    private CompositeBlock compositeBlock = null;
    {
        blocks = compositeBlock.getBlocks();
    }

    @Override
    public Optional findBlockByColor(String color) {
        return blocks.stream().filter(block -> block.getColor().equals(color)).findAny();
    }

    @Override
    public List findBlocksByMaterial(String material) {
        return blocks.stream().filter(block -> block.getMaterial().equals(material)).collect(Collectors.toList());
    }

    @Override
    public int count() {
        return blocks.size();
    }
}

